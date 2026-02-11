
PN = "urw-base35-fonts"
PE = "0"
PV = "20200910"
PR = "21.el10"
PACKAGES = "urw-base35-bookman-fonts urw-base35-c059-fonts urw-base35-d050000l-fonts urw-base35-fonts urw-base35-fonts-common urw-base35-gothic-fonts urw-base35-nimbus-mono-ps-fonts urw-base35-nimbus-roman-fonts urw-base35-nimbus-sans-fonts urw-base35-p052-fonts urw-base35-standard-symbols-ps-fonts urw-base35-z003-fonts urw-base35-fonts-devel urw-base35-fonts-legacy"


URI_urw-base35-bookman-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-bookman-fonts-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-bookman-fonts = "/bin/sh ( ) coreutils ( ) urw-base35-fonts-common ( =  20200910-21.el10)"
RPROVIDES:urw-base35-bookman-fonts = "metainfo() ( ) font(urwbookman) ( ) metainfo(de.urwpp.URWBookman.metainfo.xml) ( ) urw-base35-bookman-fonts ( =  20200910-21.el10)"

URI_urw-base35-c059-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-c059-fonts-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-c059-fonts = "/bin/sh ( ) coreutils ( ) urw-base35-fonts-common ( =  20200910-21.el10)"
RPROVIDES:urw-base35-c059-fonts = "metainfo() ( ) font(c059) ( ) metainfo(de.urwpp.C059.metainfo.xml) ( ) urw-base35-c059-fonts ( =  20200910-21.el10)"

URI_urw-base35-d050000l-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-d050000l-fonts-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-d050000l-fonts = "/bin/sh ( ) coreutils ( ) urw-base35-fonts-common ( =  20200910-21.el10)"
RPROVIDES:urw-base35-d050000l-fonts = "metainfo() ( ) font(d050000l) ( ) metainfo(de.urwpp.D050000L.metainfo.xml) ( ) urw-base35-d050000l-fonts ( =  20200910-21.el10)"

URI_urw-base35-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-fonts-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-fonts = "urw-base35-bookman-fonts ( ) urw-base35-c059-fonts ( ) urw-base35-d050000l-fonts ( ) urw-base35-gothic-fonts ( ) urw-base35-nimbus-mono-ps-fonts ( ) urw-base35-nimbus-roman-fonts ( ) urw-base35-nimbus-sans-fonts ( ) urw-base35-p052-fonts ( ) urw-base35-standard-symbols-ps-fonts ( ) urw-base35-z003-fonts ( ) urw-base35-fonts-common ( =  20200910-21.el10)"
RPROVIDES:urw-base35-fonts = "metainfo() ( ) metainfo(de.urwpp.URWCoreFontSetLevel2.metainfo.xml) ( ) urw-base35-fonts ( =  20200910-21.el10) urw-fonts ( =  3:2.4-25)"

URI_urw-base35-fonts-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-fonts-common-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-fonts-common = "fontpackages-filesystem ( ) filesystem ( )"
RPROVIDES:urw-base35-fonts-common = "urw-base35-fonts-common ( =  20200910-21.el10)"

URI_urw-base35-gothic-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-gothic-fonts-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-gothic-fonts = "/bin/sh ( ) coreutils ( ) urw-base35-fonts-common ( =  20200910-21.el10)"
RPROVIDES:urw-base35-gothic-fonts = "metainfo() ( ) font(urwgothic) ( ) metainfo(de.urwpp.URWGothic.metainfo.xml) ( ) urw-base35-gothic-fonts ( =  20200910-21.el10)"

URI_urw-base35-nimbus-mono-ps-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-nimbus-mono-ps-fonts-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-nimbus-mono-ps-fonts = "/bin/sh ( ) coreutils ( ) urw-base35-fonts-common ( =  20200910-21.el10)"
RPROVIDES:urw-base35-nimbus-mono-ps-fonts = "metainfo() ( ) font(nimbusmonops) ( ) metainfo(de.urwpp.NimbusMonoPS.metainfo.xml) ( ) urw-base35-nimbus-mono-ps-fonts ( =  20200910-21.el10)"

URI_urw-base35-nimbus-roman-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-nimbus-roman-fonts-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-nimbus-roman-fonts = "/bin/sh ( ) coreutils ( ) urw-base35-fonts-common ( =  20200910-21.el10)"
RPROVIDES:urw-base35-nimbus-roman-fonts = "metainfo() ( ) font(nimbusroman) ( ) metainfo(de.urwpp.NimbusRoman.metainfo.xml) ( ) urw-base35-nimbus-roman-fonts ( =  20200910-21.el10)"

URI_urw-base35-nimbus-sans-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-nimbus-sans-fonts-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-nimbus-sans-fonts = "/bin/sh ( ) coreutils ( ) urw-base35-fonts-common ( =  20200910-21.el10)"
RPROVIDES:urw-base35-nimbus-sans-fonts = "metainfo() ( ) font(nimbussans) ( ) font(nimbussansnarrow) ( ) metainfo(de.urwpp.NimbusSans.metainfo.xml) ( ) urw-base35-nimbus-sans-fonts ( =  20200910-21.el10)"

URI_urw-base35-p052-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-p052-fonts-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-p052-fonts = "/bin/sh ( ) coreutils ( ) urw-base35-fonts-common ( =  20200910-21.el10)"
RPROVIDES:urw-base35-p052-fonts = "metainfo() ( ) font(p052) ( ) metainfo(de.urwpp.P052.metainfo.xml) ( ) urw-base35-p052-fonts ( =  20200910-21.el10)"

URI_urw-base35-standard-symbols-ps-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-standard-symbols-ps-fonts-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-standard-symbols-ps-fonts = "/bin/sh ( ) coreutils ( ) urw-base35-fonts-common ( =  20200910-21.el10)"
RPROVIDES:urw-base35-standard-symbols-ps-fonts = "metainfo() ( ) font(standardsymbolsps) ( ) metainfo(de.urwpp.StandardSymbolsPS.metainfo.xml) ( ) urw-base35-standard-symbols-ps-fonts ( =  20200910-21.el10)"

URI_urw-base35-z003-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urw-base35-z003-fonts-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-z003-fonts = "/bin/sh ( ) coreutils ( ) urw-base35-fonts-common ( =  20200910-21.el10)"
RPROVIDES:urw-base35-z003-fonts = "metainfo() ( ) font(z003) ( ) metainfo(de.urwpp.Z003.metainfo.xml) ( ) urw-base35-z003-fonts ( =  20200910-21.el10)"

URI_urw-base35-fonts-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/urw-base35-fonts-devel-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-fonts-devel = "urw-base35-fonts ( =  20200910-21.el10)"
RPROVIDES:urw-base35-fonts-devel = "rpm_macro(urw_base35_fontpath) ( ) urw-base35-fonts-devel ( =  20200910-21.el10)"

URI_urw-base35-fonts-legacy = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/urw-base35-fonts-legacy-20200910-21.el10.noarch.rpm;unpack=0"
RDEPENDS:urw-base35-fonts-legacy = "/bin/sh ( ) mkfontdir ( ) mkfontscale ( )"
RPROVIDES:urw-base35-fonts-legacy = "urw-base35-fonts-legacy ( =  20200910-21.el10)"
