
inherit dnf-bridge

PN = "liberation-fonts"
PE = "1"
PV = "2.1.5"
PR = "11.el10"
PACKAGES = "liberation-fonts liberation-fonts-common liberation-mono-fonts liberation-sans-fonts liberation-serif-fonts"


URI_liberation-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liberation-fonts-2.1.5-11.el10.noarch.rpm;unpack=0"
RDEPENDS:liberation-fonts = " \
 liberation-sans-fonts \
 liberation-serif-fonts \
 liberation-mono-fonts \
"

URI_liberation-fonts-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liberation-fonts-common-2.1.5-11.el10.noarch.rpm;unpack=0"
RDEPENDS:liberation-fonts-common = " \
 fonts-filesystem \
"

URI_liberation-mono-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liberation-mono-fonts-2.1.5-11.el10.noarch.rpm;unpack=0"
RDEPENDS:liberation-mono-fonts = " \
 liberation-fonts-common \
"

URI_liberation-sans-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liberation-sans-fonts-2.1.5-11.el10.noarch.rpm;unpack=0"
RDEPENDS:liberation-sans-fonts = " \
 liberation-fonts-common \
"

URI_liberation-serif-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liberation-serif-fonts-2.1.5-11.el10.noarch.rpm;unpack=0"
RDEPENDS:liberation-serif-fonts = " \
 liberation-fonts-common \
"
