
PN = "libiptcdata"
PE = "0"
PV = "1.0.5"
PR = "20.el10"
PACKAGES = "libiptcdata libiptcdata-devel"


URI_libiptcdata = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libiptcdata-1.0.5-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libiptcdata = "
 glibc
"

URI_libiptcdata-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libiptcdata-devel-1.0.5-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libiptcdata-devel = "
 libiptcdata
 pkgconf-pkg-config
"
