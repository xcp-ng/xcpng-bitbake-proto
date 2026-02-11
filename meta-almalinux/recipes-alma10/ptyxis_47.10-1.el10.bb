
inherit dnf-bridge

PN = "ptyxis"
PE = "0"
PV = "47.10"
PR = "1.el10"
PACKAGES = "ptyxis"


URI_ptyxis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ptyxis-47.10-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ptyxis = " \
 libportal-gtk4 \
 libgcc \
 json-glib \
 pango \
 vte291-gtk4 \
 glib2 \
 libportal \
 glibc \
 gtk4 \
 hicolor-icon-theme \
 libadwaita \
"
