
PN = "ima-evm-utils"
PE = "0"
PV = "1.6.2"
PR = "1.el10"
PACKAGES = "ima-evm-utils ima-evm-utils-devel"


URI_ima-evm-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ima-evm-utils-1.6.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ima-evm-utils = "
 attr
 keyutils
 keyutils-libs
 openssl-libs
 bash
 tpm2-tss
 glibc
"

URI_ima-evm-utils-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ima-evm-utils-devel-1.6.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ima-evm-utils-devel = "
 ima-evm-utils
"
