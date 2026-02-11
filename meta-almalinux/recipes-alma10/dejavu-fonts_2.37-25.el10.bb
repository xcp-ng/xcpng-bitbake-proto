
inherit dnf-bridge

PN = "dejavu-fonts"
PE = "0"
PV = "2.37"
PR = "25.el10"
PACKAGES = "dejavu-sans-fonts dejavu-sans-mono-fonts dejavu-serif-fonts dejavu-lgc-sans-fonts dejavu-lgc-sans-mono-fonts dejavu-lgc-serif-fonts dejavu-fonts-all dejavu-fonts-doc dejavu-lgc-fonts-all"


URI_dejavu-sans-fonts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dejavu-sans-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-sans-fonts = " \
 fonts-filesystem \
"

URI_dejavu-sans-mono-fonts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dejavu-sans-mono-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-sans-mono-fonts = " \
 fonts-filesystem \
"

URI_dejavu-serif-fonts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dejavu-serif-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-serif-fonts = " \
 fonts-filesystem \
"

URI_dejavu-lgc-sans-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dejavu-lgc-sans-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-lgc-sans-fonts = " \
 fonts-filesystem \
"

URI_dejavu-lgc-sans-mono-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dejavu-lgc-sans-mono-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-lgc-sans-mono-fonts = " \
 fonts-filesystem \
"

URI_dejavu-lgc-serif-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dejavu-lgc-serif-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-lgc-serif-fonts = " \
 fonts-filesystem \
"

URI_dejavu-fonts-all = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dejavu-fonts-all-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-fonts-all = " \
 dejavu-sans-fonts \
 dejavu-sans-mono-fonts \
 dejavu-serif-fonts \
"

URI_dejavu-fonts-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dejavu-fonts-doc-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-fonts-doc = ""

URI_dejavu-lgc-fonts-all = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dejavu-lgc-fonts-all-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-lgc-fonts-all = " \
 dejavu-lgc-serif-fonts \
 dejavu-lgc-sans-fonts \
 dejavu-lgc-sans-mono-fonts \
"
