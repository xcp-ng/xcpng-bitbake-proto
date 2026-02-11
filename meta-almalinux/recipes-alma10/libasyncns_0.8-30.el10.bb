
PN = "libasyncns"
PE = "0"
PV = "0.8"
PR = "30.el10"
PACKAGES = "libasyncns libasyncns-devel"


URI_libasyncns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libasyncns-0.8-30.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libasyncns = "
 glibc
"

URI_libasyncns-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libasyncns-devel-0.8-30.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libasyncns-devel = "
 libasyncns
 pkgconf-pkg-config
"
