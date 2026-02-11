
PN = "evince"
PE = "0"
PV = "46.1"
PR = "2.el10"
PACKAGES = "evince evince-devel evince-dvi evince-libs evince-previewer evince-thumbnailer"


URI_evince = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/evince-46.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:evince = "
 libhandy
 atk
 cairo-gobject
 gnome-desktop3
 libgcc
 pango
 gdk-pixbuf2
 libsecret
 cairo
 glib2
 gtk3
 glibc
 evince-libs
 evince-previewer
 evince-thumbnailer
"

URI_evince-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/evince-devel-46.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:evince-devel = "
 glib2-devel
 evince-libs
 pkgconf-pkg-config
 gtk3-devel
"

URI_evince-dvi = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/evince-dvi-46.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:evince-dvi = "
 texlive-lib
 libspectre
 cairo
 glib2
 gtk3
 glibc
 evince-libs
 texlive-collection-fontsrecommended
"

URI_evince-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/evince-libs-46.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:evince-libs = "
 libgxps
 atk
 texlive-lib
 libarchive
 gstreamer1
 libspectre
 libgcc
 libxml2
 pango
 gdk-pixbuf2
 gstreamer1-plugins-base
 poppler-glib
 cairo
 glib2
 gtk3
 glibc
 libtiff
"

URI_evince-previewer = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/evince-previewer-46.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:evince-previewer = "
 libhandy
 atk
 glib2
 gtk3
 glibc
 evince-libs
"

URI_evince-thumbnailer = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/evince-thumbnailer-46.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:evince-thumbnailer = "
 gdk-pixbuf2
 glib2
 gtk3
 glibc
 evince-libs
"
