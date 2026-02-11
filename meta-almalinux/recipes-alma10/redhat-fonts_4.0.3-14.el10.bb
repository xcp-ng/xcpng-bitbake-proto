
PN = "redhat-fonts"
PE = "0"
PV = "4.0.3"
PR = "14.el10"
PACKAGES = "redhat-mono-vf-fonts redhat-text-vf-fonts redhat-display-fonts redhat-display-vf-fonts redhat-mono-fonts redhat-text-fonts"


URI_redhat-mono-vf-fonts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/redhat-mono-vf-fonts-4.0.3-14.el10.noarch.rpm;unpack=0"
RDEPENDS:redhat-mono-vf-fonts = "fontpackages-filesystem ( )"
RPROVIDES:redhat-mono-vf-fonts = "metainfo() ( ) font(redhatmonovf) ( ) font(redhatmono) ( ) font(redhatmonolight) ( ) metainfo(com.redhat.redhat-mono-vf.metainfo.xml) ( ) config(redhat-mono-vf-fonts) ( =  4.0.3-14.el10) redhat-mono-vf-fonts ( =  4.0.3-14.el10)"

URI_redhat-text-vf-fonts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/redhat-text-vf-fonts-4.0.3-14.el10.noarch.rpm;unpack=0"
RDEPENDS:redhat-text-vf-fonts = "fontpackages-filesystem ( )"
RPROVIDES:redhat-text-vf-fonts = "metainfo() ( ) font(redhattextvf) ( ) font(redhattext) ( ) metainfo(com.redhat.redhat-text-vf.metainfo.xml) ( ) config(redhat-text-vf-fonts) ( =  4.0.3-14.el10) redhat-text-vf-fonts ( =  4.0.3-14.el10)"

URI_redhat-display-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/redhat-display-fonts-4.0.3-14.el10.noarch.rpm;unpack=0"
RDEPENDS:redhat-display-fonts = "fontpackages-filesystem ( )"
RPROVIDES:redhat-display-fonts = "metainfo() ( ) font(redhatdisplay) ( ) font(redhatdisplayblack) ( ) font(redhatdisplaylight) ( ) font(redhatdisplaymedium) ( ) metainfo(com.redhat.redhat-display.metainfo.xml) ( ) config(redhat-display-fonts) ( =  4.0.3-14.el10) redhat-display-fonts ( =  4.0.3-14.el10)"

URI_redhat-display-vf-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/redhat-display-vf-fonts-4.0.3-14.el10.noarch.rpm;unpack=0"
RDEPENDS:redhat-display-vf-fonts = "fontpackages-filesystem ( )"
RPROVIDES:redhat-display-vf-fonts = "metainfo() ( ) font(redhatdisplay) ( ) font(redhatdisplayvf) ( ) metainfo(com.redhat.redhat-display-vf.metainfo.xml) ( ) config(redhat-display-vf-fonts) ( =  4.0.3-14.el10) redhat-display-vf-fonts ( =  4.0.3-14.el10)"

URI_redhat-mono-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/redhat-mono-fonts-4.0.3-14.el10.noarch.rpm;unpack=0"
RDEPENDS:redhat-mono-fonts = "fontpackages-filesystem ( )"
RPROVIDES:redhat-mono-fonts = "metainfo() ( ) font(redhatmono) ( ) font(redhatmonolight) ( ) font(redhatmonomedium) ( ) metainfo(com.redhat.redhat-mono.metainfo.xml) ( ) config(redhat-mono-fonts) ( =  4.0.3-14.el10) redhat-mono-fonts ( =  4.0.3-14.el10)"

URI_redhat-text-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/redhat-text-fonts-4.0.3-14.el10.noarch.rpm;unpack=0"
RDEPENDS:redhat-text-fonts = "fontpackages-filesystem ( )"
RPROVIDES:redhat-text-fonts = "metainfo() ( ) font(redhattext) ( ) font(redhattextlight) ( ) font(redhattextmedium) ( ) metainfo(com.redhat.redhat-text.metainfo.xml) ( ) config(redhat-text-fonts) ( =  4.0.3-14.el10) redhat-text-fonts ( =  4.0.3-14.el10)"
