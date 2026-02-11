
inherit dnf-bridge

PN = "flex"
PE = "0"
PV = "2.6.4"
PR = "19.el10"
PACKAGES = "flex libfl-static libfl-devel libfl2"


URI_flex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flex-2.6.4-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flex = " \
 glibc \
 m4 \
"

URI_libfl-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfl-static-2.6.4-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfl-static = ""

URI_libfl-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libfl-devel-2.6.4-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfl-devel = " \
 libfl2 \
"

URI_libfl2 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libfl2-2.6.4-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfl2 = " \
 glibc \
"
