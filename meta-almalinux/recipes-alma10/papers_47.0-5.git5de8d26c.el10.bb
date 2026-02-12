
inherit dnf-bridge

PN = "papers"
PE = "0"
PV = "47.0"
PR = "5.git5de8d26c.el10"
PACKAGES = "papers papers-libs papers-nautilus papers-previewer papers-thumbnailer papers-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/papers-47.0-5.git5de8d26c.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_papers = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/papers-47.0-5.git5de8d26c.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_papers}"
RDEPENDS:papers = " \
 libgcc \
 pango \
 gdk-pixbuf2 \
 papers-libs \
 papers-previewer \
 glib2 \
 graphene \
 papers-thumbnailer \
 glibc \
 gtk4 \
 hicolor-icon-theme \
 libadwaita \
"

URI_papers-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/papers-libs-47.0-5.git5de8d26c.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_papers-libs}"
RDEPENDS:papers-libs = " \
 libarchive \
 libspelling \
 libgcc \
 pango \
 gdk-pixbuf2 \
 exempi \
 poppler-glib \
 cairo \
 glib2 \
 graphene \
 glibc \
 gtk4 \
 libadwaita \
 gtksourceview5 \
 libtiff \
"

URI_papers-nautilus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/papers-nautilus-47.0-5.git5de8d26c.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_papers-nautilus}"
RDEPENDS:papers-nautilus = " \
 libgcc \
 papers-libs \
 glib2 \
 glibc \
 nautilus \
 nautilus-extensions \
"

URI_papers-previewer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/papers-previewer-47.0-5.git5de8d26c.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_papers-previewer}"
RDEPENDS:papers-previewer = " \
 libgcc \
 papers-libs \
 glib2 \
 glibc \
 gtk4 \
 libadwaita \
"

URI_papers-thumbnailer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/papers-thumbnailer-47.0-5.git5de8d26c.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_papers-thumbnailer}"
RDEPENDS:papers-thumbnailer = " \
 libgcc \
 gdk-pixbuf2 \
 papers-libs \
 glib2 \
 glibc \
"

URI_papers-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/papers-devel-47.0-5.git5de8d26c.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_papers-devel}"
RDEPENDS:papers-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 papers-libs \
 libadwaita-devel \
 gtk4-devel \
"
