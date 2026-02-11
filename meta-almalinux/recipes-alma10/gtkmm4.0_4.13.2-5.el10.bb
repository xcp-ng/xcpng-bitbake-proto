
PN = "gtkmm4.0"
PE = "0"
PV = "4.13.2"
PR = "5.el10"
PACKAGES = "gtkmm4.0 gtkmm4.0-devel gtkmm4.0-doc"


URI_gtkmm4.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtkmm4.0-4.13.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtkmm4.0 = "
 libgcc
 gdk-pixbuf2
 glibmm2.68
 pangomm2.48
 libstdc++
 glib2
 graphene
 cairo-gobject
 glibc
 cairomm1.16
 gtk4
 libsigc++30
"

URI_gtkmm4.0-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtkmm4.0-devel-4.13.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtkmm4.0-devel = "
 pangomm2.48-devel
 pkgconf-pkg-config
 cairomm1.16-devel
 glibmm2.68-devel
 gdk-pixbuf2-devel
 gtk4-devel
 gtkmm4.0
"

URI_gtkmm4.0-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtkmm4.0-doc-4.13.2-5.el10.noarch.rpm;unpack=0"
RDEPENDS:gtkmm4.0-doc = "
 glibmm2.68-doc
 gtkmm4.0
"
