
PN = "libhandy"
PE = "0"
PV = "1.8.3"
PR = "4.el10"
PACKAGES = "libhandy libhandy-devel"


URI_libhandy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libhandy-1.8.3-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libhandy = "
 atk
 libgcc
 fribidi
 pango
 gdk-pixbuf2
 cairo
 glib2
 gtk3
 glibc
"

URI_libhandy-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libhandy-devel-1.8.3-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libhandy-devel = "
 libhandy
 pkgconf-pkg-config
 gtk3-devel
"
