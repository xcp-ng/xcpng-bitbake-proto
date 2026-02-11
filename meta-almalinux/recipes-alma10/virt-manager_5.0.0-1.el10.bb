
PN = "virt-manager"
PE = "0"
PV = "5.0.0"
PR = "1.el10"
PACKAGES = "virt-install virt-manager-common virt-manager"


URI_virt-install = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virt-install-5.0.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:virt-install = "/usr/bin/python3 ( ) libvirt-client ( ) virt-manager-common ( =  5.0.0-1.el10)"
RPROVIDES:virt-install = "virt-install ( ) virt-clone ( ) virt-xml ( ) virt-install ( =  5.0.0-1.el10)"

URI_virt-manager-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virt-manager-common-5.0.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:virt-manager-common = "python3-requests ( ) python3-gobject-base ( ) python3-argcomplete ( ) xorriso ( ) python3-libvirt ( ) python3-libxml2 ( ) libosinfo ( >=  0.2.10)"
RPROVIDES:virt-manager-common = "virt-manager-common ( =  5.0.0-1.el10)"

URI_virt-manager = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/virt-manager-5.0.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:virt-manager = "/usr/bin/python3 ( ) vte291 ( ) dconf ( ) gtk-vnc2 ( ) virt-manager-common ( =  5.0.0-1.el10) gtk3 ( >=  3.22.0) libvirt-glib ( >=  0.0.9) python3-gobject ( >=  3.31.3)"
RPROVIDES:virt-manager = "application() ( ) metainfo() ( ) application(virt-manager.desktop) ( ) metainfo(virt-manager.appdata.xml) ( ) virt-manager ( =  5.0.0-1.el10)"
