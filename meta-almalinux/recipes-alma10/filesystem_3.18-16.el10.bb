
inherit dnf-bridge

PN = "filesystem"
PE = "0"
PV = "3.18"
PR = "16.el10"
PACKAGES = "filesystem filesystem-content"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/filesystem-3.18-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_filesystem = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/filesystem-3.18-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_filesystem}"
RDEPENDS:filesystem = " \
 setup \
"

URI_filesystem-content = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/filesystem-content-3.18-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_filesystem-content}"
RDEPENDS:filesystem-content = ""
