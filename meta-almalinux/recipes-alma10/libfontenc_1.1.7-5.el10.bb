
PN = "libfontenc"
PE = "0"
PV = "1.1.7"
PR = "5.el10"
PACKAGES = "libfontenc libfontenc-devel"


URI_libfontenc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libfontenc-1.1.7-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfontenc = " \
 glibc \
 zlib-ng-compat \
"

URI_libfontenc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfontenc-devel-1.1.7-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfontenc-devel = " \
 libfontenc \
 pkgconf-pkg-config \
"
