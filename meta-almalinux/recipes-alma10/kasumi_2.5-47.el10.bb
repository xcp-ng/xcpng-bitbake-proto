
PN = "kasumi"
PE = "0"
PV = "2.5"
PR = "47.el10"
PACKAGES = "kasumi-common kasumi-unicode"


URI_kasumi-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kasumi-common-2.5-47.el10.noarch.rpm;unpack=0"
RDEPENDS:kasumi-common = ""

URI_kasumi-unicode = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kasumi-unicode-2.5-47.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kasumi-unicode = "
 kasumi-common
 libgcc
 libstdc++
 glib2
 gtk3
 glibc
 anthy-unicode
"
