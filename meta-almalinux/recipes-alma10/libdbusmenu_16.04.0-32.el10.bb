
PN = "libdbusmenu"
PE = "0"
PV = "16.04.0"
PR = "32.el10"
PACKAGES = "libdbusmenu libdbusmenu-devel libdbusmenu-gtk3 libdbusmenu-gtk3-devel libdbusmenu-doc libdbusmenu-gtk3-tests libdbusmenu-jsonloader libdbusmenu-jsonloader-devel libdbusmenu-tools"


URI_libdbusmenu = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdbusmenu-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu = "
 glibc
 glib2
"

URI_libdbusmenu-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdbusmenu-devel-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-devel = "
 libdbusmenu
 pkgconf-pkg-config
"

URI_libdbusmenu-gtk3 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdbusmenu-gtk3-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-gtk3 = "
 atk
 cairo-gobject
 harfbuzz
 libdbusmenu
 pango
 gdk-pixbuf2
 cairo
 glib2
 gtk3
 glibc
"

URI_libdbusmenu-gtk3-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdbusmenu-gtk3-devel-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-gtk3-devel = "
 libdbusmenu
 libdbusmenu-devel
 pkgconf-pkg-config
 libdbusmenu-gtk3
 gdk-pixbuf2-devel
 gtk3-devel
"

URI_libdbusmenu-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdbusmenu-doc-16.04.0-32.el10.noarch.rpm;unpack=0"
RDEPENDS:libdbusmenu-doc = ""

URI_libdbusmenu-gtk3-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdbusmenu-gtk3-tests-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-gtk3-tests = "
 libdbusmenu
 libdbusmenu-gtk3
 bash
 glib2
 glibc
"

URI_libdbusmenu-jsonloader = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdbusmenu-jsonloader-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-jsonloader = "
 libdbusmenu
 libdbusmenu-devel
 json-glib
 glib2
 glibc
"

URI_libdbusmenu-jsonloader-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdbusmenu-jsonloader-devel-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-jsonloader-devel = "
 json-glib-devel
 libdbusmenu
 libdbusmenu-devel
 libdbusmenu-jsonloader
 pkgconf-pkg-config
"

URI_libdbusmenu-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdbusmenu-tools-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-tools = "
 glibc
 libdbusmenu
 glib2
 json-glib
"
