
PN = "paps"
PE = "0"
PV = "0.8.0"
PR = "10.el10"
PACKAGES = "paps texttopaps"


URI_paps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/paps-0.8.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:paps = "
 python3
 libgcc
 pango
 libstdc++
 glib2
 cairo
 glibc
"

URI_texttopaps = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/texttopaps-0.8.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texttopaps = "
 fonts-filesystem
 freetype
 cups-filesystem
 harfbuzz
 cups-libs
 pango
 fontconfig
 glib2
 glibc
"
