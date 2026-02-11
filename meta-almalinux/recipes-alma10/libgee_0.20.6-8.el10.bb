
PN = "libgee"
PE = "0"
PV = "0.20.6"
PR = "8.el10"
PACKAGES = "libgee libgee-devel"


URI_libgee = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgee-0.20.6-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgee = " \
 glibc \
 glib2 \
"

URI_libgee-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgee-devel-0.20.6-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgee-devel = " \
 libgee \
 glib2-devel \
 pkgconf-pkg-config \
"
