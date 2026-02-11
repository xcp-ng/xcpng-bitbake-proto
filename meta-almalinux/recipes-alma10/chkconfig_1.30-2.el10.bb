
inherit dnf-bridge

PN = "chkconfig"
PE = "0"
PV = "1.30"
PR = "2.el10"
PACKAGES = "alternatives chkconfig ntsysv"


URI_alternatives = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/alternatives-1.30-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alternatives = " \
 glibc \
"

URI_chkconfig = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/chkconfig-1.30-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:chkconfig = " \
 glibc \
 libselinux \
 popt \
"

URI_ntsysv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ntsysv-1.30-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ntsysv = " \
 newt \
 chkconfig \
 popt \
 glibc \
 libselinux \
"
