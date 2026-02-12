
inherit dnf-bridge

PN = "chkconfig"
PE = "0"
PV = "1.30"
PR = "2.el10"
PACKAGES = "alternatives chkconfig ntsysv"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/chkconfig-1.30-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_alternatives = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/alternatives-1.30-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_alternatives}"
RDEPENDS:alternatives = " \
 glibc \
"

URI_chkconfig = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/chkconfig-1.30-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_chkconfig}"
RDEPENDS:chkconfig = " \
 glibc \
 libselinux \
 popt \
"

URI_ntsysv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ntsysv-1.30-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ntsysv}"
RDEPENDS:ntsysv = " \
 newt \
 chkconfig \
 popt \
 glibc \
 libselinux \
"
