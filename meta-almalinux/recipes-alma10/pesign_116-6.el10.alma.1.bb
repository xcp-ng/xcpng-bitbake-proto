
PN = "pesign"
PE = "0"
PV = "116"
PR = "6.el10.alma.1"
PACKAGES = "pesign"


URI_pesign = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pesign-116-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:pesign = "
 python3
 libuuid
 shadow-utils
 nss
 efivar-libs
 nss-tools
 bash
 nss-util
 popt
 glibc
 rpm
 nspr
"
