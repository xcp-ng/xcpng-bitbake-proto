
inherit dnf-bridge

PN = "network-manager-applet"
PE = "0"
PV = "1.36.0"
PR = "4.el10"
PACKAGES = "network-manager-applet nm-connection-editor nm-connection-editor-desktop"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/network-manager-applet-1.36.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_network-manager-applet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/network-manager-applet-1.36.0-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_network-manager-applet}"
RDEPENDS:network-manager-applet = " \
 NetworkManager \
 nm-connection-editor \
 libnma \
"

URI_nm-connection-editor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nm-connection-editor-1.36.0-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nm-connection-editor}"
RDEPENDS:nm-connection-editor = " \
 jansson \
 libgcc \
 glib2 \
 gtk3 \
 glibc \
 libselinux \
 NetworkManager-libnm \
 libnma \
"

URI_nm-connection-editor-desktop = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nm-connection-editor-desktop-1.36.0-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nm-connection-editor-desktop}"
RDEPENDS:nm-connection-editor-desktop = " \
 nm-connection-editor \
"
