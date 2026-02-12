
inherit dnf-bridge

PN = "vazirmatn-fonts"
PE = "0"
PV = "33.003"
PR = "10.el10"
PACKAGES = "vazirmatn-vf-fonts vazirmatn-fonts vazirmatn-fonts-all vazirmatn-nl-fonts vazirmatn-nl-vf-fonts vazirmatn-rd-fonts vazirmatn-rd-nl-fonts vazirmatn-rd-nl-vf-fonts vazirmatn-rd-ui-fonts vazirmatn-rd-ui-nl-fonts vazirmatn-rd-vf-fonts vazirmatn-ui-fonts vazirmatn-ui-nl-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/vazirmatn-fonts-33.003-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_vazirmatn-vf-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vazirmatn-vf-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-vf-fonts}"
RDEPENDS:vazirmatn-vf-fonts = " \
 fonts-filesystem \
"

URI_vazirmatn-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-fonts}"
RDEPENDS:vazirmatn-fonts = " \
 fonts-filesystem \
"

URI_vazirmatn-fonts-all = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-fonts-all-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-fonts-all}"
RDEPENDS:vazirmatn-fonts-all = " \
 vazirmatn-vf-fonts \
 vazirmatn-fonts \
 vazirmatn-nl-fonts \
 vazirmatn-nl-vf-fonts \
 vazirmatn-rd-fonts \
 vazirmatn-rd-nl-fonts \
 vazirmatn-rd-nl-vf-fonts \
 vazirmatn-rd-ui-fonts \
 vazirmatn-rd-ui-nl-fonts \
 vazirmatn-rd-vf-fonts \
 vazirmatn-ui-fonts \
 vazirmatn-ui-nl-fonts \
"

URI_vazirmatn-nl-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-nl-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-nl-fonts}"
RDEPENDS:vazirmatn-nl-fonts = " \
 fonts-filesystem \
"

URI_vazirmatn-nl-vf-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-nl-vf-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-nl-vf-fonts}"
RDEPENDS:vazirmatn-nl-vf-fonts = " \
 fonts-filesystem \
"

URI_vazirmatn-rd-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-rd-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-rd-fonts}"
RDEPENDS:vazirmatn-rd-fonts = " \
 fonts-filesystem \
"

URI_vazirmatn-rd-nl-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-rd-nl-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-rd-nl-fonts}"
RDEPENDS:vazirmatn-rd-nl-fonts = " \
 fonts-filesystem \
"

URI_vazirmatn-rd-nl-vf-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-rd-nl-vf-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-rd-nl-vf-fonts}"
RDEPENDS:vazirmatn-rd-nl-vf-fonts = " \
 fonts-filesystem \
"

URI_vazirmatn-rd-ui-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-rd-ui-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-rd-ui-fonts}"
RDEPENDS:vazirmatn-rd-ui-fonts = " \
 fonts-filesystem \
"

URI_vazirmatn-rd-ui-nl-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-rd-ui-nl-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-rd-ui-nl-fonts}"
RDEPENDS:vazirmatn-rd-ui-nl-fonts = " \
 fonts-filesystem \
"

URI_vazirmatn-rd-vf-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-rd-vf-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-rd-vf-fonts}"
RDEPENDS:vazirmatn-rd-vf-fonts = " \
 fonts-filesystem \
"

URI_vazirmatn-ui-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-ui-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-ui-fonts}"
RDEPENDS:vazirmatn-ui-fonts = " \
 fonts-filesystem \
"

URI_vazirmatn-ui-nl-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/vazirmatn-ui-nl-fonts-33.003-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vazirmatn-ui-nl-fonts}"
RDEPENDS:vazirmatn-ui-nl-fonts = " \
 fonts-filesystem \
"
