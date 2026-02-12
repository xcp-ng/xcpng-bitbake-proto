
inherit dnf-bridge

PN = "procmail"
PE = "0"
PV = "3.24"
PR = "8.el10"
PACKAGES = "procmail"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/procmail-3.24-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_procmail = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/procmail-3.24-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_procmail}"
RDEPENDS:procmail = " \
 glibc \
 bash \
"
