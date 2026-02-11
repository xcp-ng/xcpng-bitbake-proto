
PN = "gnome-calculator"
PE = "0"
PV = "46.1"
PR = "1.el10"
PACKAGES = "gnome-calculator gnome-calculator-devel"


URI_gnome-calculator = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-calculator-46.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-calculator = "
 libgee
 libsoup3
 mpfr
 libxml2
 libmpc
 glib2
 glibc
 gtk4
 libadwaita
 gtksourceview5
"

URI_gnome-calculator-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-calculator-devel-46.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-calculator-devel = "
 gnome-calculator
 glib2-devel
 libgee-devel
 pkgconf-pkg-config
 gnome-calculator-devel
 gtk4-devel
"
