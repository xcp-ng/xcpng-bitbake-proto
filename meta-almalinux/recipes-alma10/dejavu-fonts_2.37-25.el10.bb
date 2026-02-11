
PN = "dejavu-fonts"
PE = "0"
PV = "2.37"
PR = "25.el10"
PACKAGES = "dejavu-sans-fonts dejavu-sans-mono-fonts dejavu-serif-fonts dejavu-lgc-sans-fonts dejavu-lgc-sans-mono-fonts dejavu-lgc-serif-fonts dejavu-fonts-all dejavu-fonts-doc dejavu-lgc-fonts-all"


URI_dejavu-sans-fonts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dejavu-sans-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-sans-fonts = "fontpackages-filesystem ( )"
RPROVIDES:dejavu-sans-fonts = "metainfo() ( ) font(dejavusans) ( ) font(dejavusanscondensed) ( ) font(dejavusanslight) ( ) metainfo(org.fedoraproject.dejavu-sans-fonts.metainfo.xml) ( ) config(dejavu-sans-fonts) ( =  2.37-25.el10) dejavu-sans-fonts ( =  2.37-25.el10)"

URI_dejavu-sans-mono-fonts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dejavu-sans-mono-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-sans-mono-fonts = "fontpackages-filesystem ( )"
RPROVIDES:dejavu-sans-mono-fonts = "metainfo() ( ) font(dejavusansmono) ( ) metainfo(org.fedoraproject.dejavu-sans-mono-fonts.metainfo.xml) ( ) config(dejavu-sans-mono-fonts) ( =  2.37-25.el10) dejavu-sans-mono-fonts ( =  2.37-25.el10)"

URI_dejavu-serif-fonts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dejavu-serif-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-serif-fonts = "fontpackages-filesystem ( )"
RPROVIDES:dejavu-serif-fonts = "metainfo() ( ) font(dejavumathtexgyre) ( ) font(dejavuserif) ( ) font(dejavuserifcondensed) ( ) metainfo(org.fedoraproject.dejavu-serif-fonts.metainfo.xml) ( ) config(dejavu-serif-fonts) ( =  2.37-25.el10) dejavu-serif-fonts ( =  2.37-25.el10)"

URI_dejavu-lgc-sans-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dejavu-lgc-sans-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-lgc-sans-fonts = "fontpackages-filesystem ( )"
RPROVIDES:dejavu-lgc-sans-fonts = "metainfo() ( ) font(dejavulgcsans) ( ) font(dejavulgcsanscondensed) ( ) font(dejavulgcsanslight) ( ) metainfo(org.fedoraproject.dejavu-lgc-sans-fonts.metainfo.xml) ( ) config(dejavu-lgc-sans-fonts) ( =  2.37-25.el10) dejavu-lgc-sans-fonts ( =  2.37-25.el10)"

URI_dejavu-lgc-sans-mono-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dejavu-lgc-sans-mono-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-lgc-sans-mono-fonts = "fontpackages-filesystem ( )"
RPROVIDES:dejavu-lgc-sans-mono-fonts = "metainfo() ( ) font(dejavulgcsansmono) ( ) metainfo(org.fedoraproject.dejavu-lgc-sans-mono-fonts.metainfo.xml) ( ) config(dejavu-lgc-sans-mono-fonts) ( =  2.37-25.el10) dejavu-lgc-sans-mono-fonts ( =  2.37-25.el10)"

URI_dejavu-lgc-serif-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dejavu-lgc-serif-fonts-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-lgc-serif-fonts = "fontpackages-filesystem ( )"
RPROVIDES:dejavu-lgc-serif-fonts = "metainfo() ( ) font(dejavulgcserif) ( ) font(dejavulgcserifcondensed) ( ) metainfo(org.fedoraproject.dejavu-lgc-serif-fonts.metainfo.xml) ( ) config(dejavu-lgc-serif-fonts) ( =  2.37-25.el10) dejavu-lgc-serif-fonts ( =  2.37-25.el10)"

URI_dejavu-fonts-all = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dejavu-fonts-all-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-fonts-all = "dejavu-sans-fonts ( =  2.37-25.el10) dejavu-sans-mono-fonts ( =  2.37-25.el10) dejavu-serif-fonts ( =  2.37-25.el10)"
RPROVIDES:dejavu-fonts-all = "dejavu-fonts-all ( =  2.37-25.el10)"

URI_dejavu-fonts-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dejavu-fonts-doc-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-fonts-doc = ""
RPROVIDES:dejavu-fonts-doc = "dejavu-fonts-doc ( =  2.37-25.el10)"

URI_dejavu-lgc-fonts-all = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dejavu-lgc-fonts-all-2.37-25.el10.noarch.rpm;unpack=0"
RDEPENDS:dejavu-lgc-fonts-all = "dejavu-lgc-sans-fonts ( =  2.37-25.el10) dejavu-lgc-sans-mono-fonts ( =  2.37-25.el10) dejavu-lgc-serif-fonts ( =  2.37-25.el10)"
RPROVIDES:dejavu-lgc-fonts-all = "dejavu-lgc-fonts-all ( =  2.37-25.el10)"
