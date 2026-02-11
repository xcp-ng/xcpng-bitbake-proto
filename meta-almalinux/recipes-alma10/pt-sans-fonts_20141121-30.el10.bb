
PN = "pt-sans-fonts"
PE = "0"
PV = "20141121"
PR = "30.el10"
PACKAGES = "pt-sans-fonts pt-sans-fonts-doc"


URI_pt-sans-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pt-sans-fonts-20141121-30.el10.noarch.rpm;unpack=0"
RDEPENDS:pt-sans-fonts = "fontpackages-filesystem ( )"
RPROVIDES:pt-sans-fonts = "metainfo() ( ) font(ptsans) ( ) font(ptsanscaption) ( ) font(ptsansnarrow) ( ) metainfo(org.fedoraproject.pt-sans-fonts.metainfo.xml) ( ) config(pt-sans-fonts) ( =  20141121-30.el10) pt-sans-fonts ( =  20141121-30.el10)"

URI_pt-sans-fonts-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pt-sans-fonts-doc-20141121-30.el10.noarch.rpm;unpack=0"
RDEPENDS:pt-sans-fonts-doc = ""
RPROVIDES:pt-sans-fonts-doc = "pt-sans-fonts-doc ( =  20141121-30.el10)"
