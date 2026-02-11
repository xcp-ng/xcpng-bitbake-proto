
PN = "sg3_utils"
PE = "0"
PV = "1.48"
PR = "7.el10"
PACKAGES = "sg3_utils sg3_utils-libs sg3_utils-devel"


URI_sg3_utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sg3_utils-1.48-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sg3_utils = "
 glibc
 sg3_utils-libs
 libgcc
 bash
"

URI_sg3_utils-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sg3_utils-libs-1.48-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sg3_utils-libs = "
 glibc
"

URI_sg3_utils-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sg3_utils-devel-1.48-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sg3_utils-devel = "
 sg3_utils-libs
"
