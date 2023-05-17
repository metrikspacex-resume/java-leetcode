package leetcode.defanging_an_ip_address;

/*
 * @lc app=leetcode id=1108 lang=java
 *
 * [1108] Defanging an IP Address
 *
 * https://leetcode.com/problems/defanging-an-ip-address/description/
 *
 * algorithms Easy (89.04%) Likes: 1666 Dislikes: 1680 Total Accepted: 519.1K
 * Total Submissions: 583K Testcase Example: '"1.1.1.1"'
 *
 * Given a valid (IPv4) IP address, return a defanged version of that IP
 * address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 *
 *
 * Example 1: Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1" Example 2:
 * Input: address = "255.100.50.0" Output: "255[.]100[.]50[.]0"
 *
 *
 * Constraints:
 *
 *
 * The given address is a valid IPv4 address.
 *
 */
// @lc code=start
class Solution {
  public String defangIPaddr(String address) {
    return address.replace(".", "[.]");
  }
}
// @lc code=end
