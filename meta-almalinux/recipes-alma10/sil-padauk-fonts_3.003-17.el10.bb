
PN = "sil-padauk-fonts"
PE = "0"
PV = "3.003"
PR = "17.el10"
PACKAGES = "sil-padauk-fonts sil-padauk-book-fonts"


URI_sil-padauk-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sil-padauk-fonts-3.003-17.el10.noarch.rpm;unpack=0"
RDEPENDS:sil-padauk-fonts = "fontpackages-filesystem ( )"
RPROVIDES:sil-padauk-fonts = "metainfo() ( ) font(padauk) ( ) metainfo(org.fedoraproject.sil-padauk-fonts.metainfo.xml) ( ) config(sil-padauk-fonts) ( =  3.003-17.el10) sil-padauk-fonts ( =  3.003-17.el10)"

URI_sil-padauk-book-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sil-padauk-book-fonts-3.003-17.el10.noarch.rpm;unpack=0"
RDEPENDS:sil-padauk-book-fonts = "fontpackages-filesystem ( )"
RPROVIDES:sil-padauk-book-fonts = "metainfo() ( ) font(padaukbook) ( ) metainfo(org.fedoraproject.sil-padauk-book-fonts.metainfo.xml) ( ) config(sil-padauk-book-fonts) ( =  3.003-17.el10) sil-padauk-book-fonts ( =  3.003-17.el10)"
