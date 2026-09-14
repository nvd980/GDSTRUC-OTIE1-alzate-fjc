public class Main {
        public static void main(String[] args) {
            int[] nums = new int[10];
            nums[0] = 237;
            nums[1] = -53;
            nums[2] = 96;
            nums[3] = 104;
            nums[4] = 395;
            nums[5] = -62;
            nums[6] = 26;
            nums[7] = -8;
            nums[8] = 13;
            nums[9] = 4;

            System.out.println("\n\nBEFORE:\n");
            printArray(nums);

            System.out.println("\n\nAFTER:\n");
            selectionSort(nums);
            printArray(nums);
        }

        private static void bubbleSort(int[] nums) {
            for (int descOrder = nums.length - 1; descOrder > 0; descOrder--) {
                for (int i = 0; i < descOrder; i++) {
                    if (nums[i] < nums[i + 1]) {
                        int temp = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = temp;
                    }
                }
            }
        }

        private static void selectionSort(int[] nums) {
            for (int lastUnsortedIndex = 0; lastUnsortedIndex < nums.length - 1; lastUnsortedIndex++) {
                int largest = lastUnsortedIndex;
                for (int i = lastUnsortedIndex + 1; i < nums.length; i++) {
                    if (nums[i] > nums[largest]) {
                        largest = i;
                    }
                }

                if (largest != lastUnsortedIndex) {
                    int temp = nums[largest];
                    nums[largest] = nums[lastUnsortedIndex];
                    nums[lastUnsortedIndex] = temp;
                }
            }
        }

        private static void printArray(int[] nums) {
            for (int num : nums) {
                System.out.println(num);
            }
        }
    }
