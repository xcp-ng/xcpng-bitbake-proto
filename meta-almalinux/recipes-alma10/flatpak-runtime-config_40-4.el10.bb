
PN = "flatpak-runtime-config"
PE = "0"
PV = "40"
PR = "4.el10"
PACKAGES = "flatpak-runtime-config"


URI_flatpak-runtime-config = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/flatpak-runtime-config-40-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-runtime-config = "/sbin/ldconfig ( ) /bin/sh ( ) findutils ( ) fontpackages-filesystem ( )"
RPROVIDES:flatpak-runtime-config = "metainfo() ( ) metainfo(com.redhat.Platform.appdata.xml) ( ) metainfo(com.redhat.Sdk.appdata.xml) ( ) metainfo(org.centos.stream.Platform.appdata.xml) ( ) metainfo(org.centos.stream.Sdk.appdata.xml) ( ) flatpak-runtime-config ( =  40-4.el10) flatpak-runtime-config(x86-64) ( =  40-4.el10)"
