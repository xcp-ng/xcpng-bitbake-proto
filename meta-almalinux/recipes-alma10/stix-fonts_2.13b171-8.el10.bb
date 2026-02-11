
PN = "stix-fonts"
PE = "0"
PV = "2.13b171"
PR = "8.el10"
PACKAGES = "stix-fonts stix-fonts-doc"


URI_stix-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/stix-fonts-2.13b171-8.el10.noarch.rpm;unpack=0"
RDEPENDS:stix-fonts = "fontpackages-filesystem ( )"
RPROVIDES:stix-fonts = "metainfo() ( ) font(stixtwomath) ( ) font(stixtwotext) ( ) font(stixtwotextmedium) ( ) font(stixtwotextsemibold) ( ) metainfo(org.fedoraproject.stix-fonts.metainfo.xml) ( ) config(stix-fonts) ( =  2.13b171-8.el10) stix-fonts ( =  2.13b171-8.el10)"

URI_stix-fonts-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/stix-fonts-doc-2.13b171-8.el10.noarch.rpm;unpack=0"
RDEPENDS:stix-fonts-doc = ""
RPROVIDES:stix-fonts-doc = "stix-fonts-doc ( =  2.13b171-8.el10)"
