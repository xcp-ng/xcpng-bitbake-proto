
inherit dnf-bridge

PN = "anthy-unicode"
PE = "0"
PV = "1.0.0.20240502"
PR = "12.el10"
PACKAGES = "anthy-unicode anthy-unicode-devel emacs-anthy-unicode"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/anthy-unicode-1.0.0.20240502-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_anthy-unicode = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anthy-unicode-1.0.0.20240502-12.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_anthy-unicode}"
RDEPENDS:anthy-unicode = " \
 glibc \
"

URI_anthy-unicode-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/anthy-unicode-devel-1.0.0.20240502-12.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_anthy-unicode-devel}"
RDEPENDS:anthy-unicode-devel = " \
 pkgconf-pkg-config \
 anthy-unicode \
"

URI_emacs-anthy-unicode = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/emacs-anthy-unicode-1.0.0.20240502-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_emacs-anthy-unicode}"
RDEPENDS:emacs-anthy-unicode = " \
 emacs-filesystem \
 anthy-unicode \
"
