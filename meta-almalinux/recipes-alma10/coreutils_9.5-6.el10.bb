
PN = "coreutils"
PE = "0"
PV = "9.5"
PR = "6.el10"
PACKAGES = "coreutils coreutils-common coreutils-single"


URI_coreutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/coreutils-9.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreutils = "
 libacl
 gmp
 libattr
 openssl-libs
 libcap
 glibc
 libselinux
 coreutils-common
"

URI_coreutils-common = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/coreutils-common-9.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreutils-common = ""

URI_coreutils-single = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/coreutils-single-9.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:coreutils-single = "
 libacl
 libattr
 libcap
 glibc
 libselinux
"
