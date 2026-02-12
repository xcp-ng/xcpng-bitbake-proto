
inherit dnf-bridge

PN = "emacs-auctex"
PE = "0"
PV = "13.3"
PR = "5.el10"
PACKAGES = "emacs-auctex tex-preview emacs-auctex-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/emacs-auctex-13.3-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_emacs-auctex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/emacs-auctex-13.3-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_emacs-auctex}"
RDEPENDS:emacs-auctex = " \
 emacs \
 texlive-collection-latexrecommended \
 tex-preview \
 texlive-dvipng \
 texlive-dvips \
 ghostscript \
"

URI_tex-preview = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tex-preview-13.3-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tex-preview}"
RDEPENDS:tex-preview = " \
 texlive-collection-latexrecommended \
"

URI_emacs-auctex-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/emacs-auctex-doc-13.3-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_emacs-auctex-doc}"
RDEPENDS:emacs-auctex-doc = ""
