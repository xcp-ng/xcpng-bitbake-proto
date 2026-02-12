
inherit dnf-bridge

PN = "grep"
PE = "0"
PV = "3.11"
PR = "10.el10"
PACKAGES = "grep"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/grep-3.11-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_grep = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/grep-3.11-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_grep}"
RDEPENDS:grep = " \
 glibc \
 bash \
 pcre2 \
"
