
PN = "emacs-auctex"
PE = "0"
PV = "13.3"
PR = "5.el10"
PACKAGES = "emacs-auctex tex-preview emacs-auctex-doc"


URI_emacs-auctex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/emacs-auctex-13.3-5.el10.noarch.rpm;unpack=0"
RDEPENDS:emacs-auctex = "ghostscript ( ) dvipng ( ) tex(latex) ( ) tex(dvips) ( ) tex-preview ( =  13.3-5.el10) emacs(bin) ( >=  29.4)"
RPROVIDES:emacs-auctex = "emacs-auctex ( =  13.3-5.el10)"

URI_tex-preview = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tex-preview-13.3-5.el10.noarch.rpm;unpack=0"
RDEPENDS:tex-preview = "tex(latex) ( )"
RPROVIDES:tex-preview = "tex-preview ( =  13.3-5.el10) tex(preview.sty) ( =  13.3-5.el10) texlive-preview ( =  7:svn44884)"

URI_emacs-auctex-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/emacs-auctex-doc-13.3-5.el10.noarch.rpm;unpack=0"
RDEPENDS:emacs-auctex-doc = ""
RPROVIDES:emacs-auctex-doc = "emacs-auctex-doc ( =  13.3-5.el10)"
