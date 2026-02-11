
PN = "gtkmm3.0"
PE = "0"
PV = "3.24.8"
PR = "6.el10"
PACKAGES = "gtkmm3.0 gtkmm3.0-devel gtkmm3.0-doc"


URI_gtkmm3.0 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gtkmm3.0-3.24.8-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtkmm3.0 = "
 cairomm
 atkmm
 libgcc
 pangomm
 gdk-pixbuf2
 libsigc++20
 libstdc++
 glib2
 gtk3
 glibc
 glibmm2.4
"

URI_gtkmm3.0-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gtkmm3.0-devel-3.24.8-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtkmm3.0-devel = "
 cairomm-devel
 atkmm-devel
 pkgconf-pkg-config
 pangomm-devel
 gtkmm3.0
 gtkmm3.0-devel
 gdk-pixbuf2-devel
 gtk3-devel
 glibmm2.4-devel
"

URI_gtkmm3.0-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gtkmm3.0-doc-3.24.8-6.el10.noarch.rpm;unpack=0"
RDEPENDS:gtkmm3.0-doc = "
 gtkmm3.0
 glibmm2.4-doc
"
