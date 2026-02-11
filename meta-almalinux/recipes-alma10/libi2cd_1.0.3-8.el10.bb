
PN = "libi2cd"
PE = "0"
PV = "1.0.3"
PR = "8.el10"
PACKAGES = "libi2cd libi2cd-devel"


URI_libi2cd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libi2cd-1.0.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libi2cd = "
 glibc
"

URI_libi2cd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libi2cd-devel-1.0.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libi2cd-devel = "
 pkgconf-pkg-config
 libi2cd
"
