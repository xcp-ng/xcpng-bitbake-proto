
inherit dnf-bridge

PN = "gnome-text-editor"
PE = "0"
PV = "47.3"
PR = "1.el10"
PACKAGES = "gnome-text-editor"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnome-text-editor-47.3-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-text-editor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-text-editor-47.3-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gnome-text-editor}"
RDEPENDS:gnome-text-editor = " \
 enchant2 \
 libspelling \
 libgcc \
 pango \
 editorconfig-libs \
 cairo \
 glib2 \
 glibc \
 gtk4 \
 libadwaita \
 gtksourceview5 \
"
