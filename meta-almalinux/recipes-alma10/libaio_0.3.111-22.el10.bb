
PN = "libaio"
PE = "0"
PV = "0.3.111"
PR = "22.el10"
PACKAGES = "libaio libaio-devel"


URI_libaio = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libaio-0.3.111-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libaio = "
 glibc
"

URI_libaio-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libaio-devel-0.3.111-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libaio-devel = "
 libaio
"
