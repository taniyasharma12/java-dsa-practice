package Arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };

		System.out.println(numUniqueEmails(emails));

	}

	public static int numUniqueEmails(String[] emails) {

		Set<String> unique_emails = new HashSet<>();
		for (String email : emails) {

			int split_position = email.indexOf("@");

			String local_name = email.substring(0, split_position);
			String domain_name = email.substring(split_position);

			if (local_name.contains("+")) {

				int plus_position = local_name.indexOf("+");
				local_name = local_name.substring(0, plus_position);
			}

			local_name = local_name.replaceAll("\\.", "");
			String new_name = local_name + domain_name;
			System.out.println(new_name);
			unique_emails.add(new_name);
		}
		return unique_emails.size();
	}
}

/*
 class Solution {
    public int numUniqueEmails(String[] emails) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i=0; i<emails.length; i++) {

            String email = emails[i];

            String newEmail = "";

            for (int j=0; j<email.indexOf('@'); j++) {

                if (email.charAt(j) != '.') {
                    if (email.charAt(j) == '+') {
                        break;
                    }
                    newEmail += email.charAt(j);
                }

            }

            newEmail += email.substring(email.indexOf('@'));

            System.out.println(newEmail);

            map.put(newEmail, map.getOrDefault(newEmail, 0) + 1);

        }

        return map.size();

    }
}
 * 
 */