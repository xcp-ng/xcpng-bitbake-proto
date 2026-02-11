
PN = "NetworkManager-libreswan"
PE = "0"
PV = "1.2.27"
PR = "2.el10_0"
PACKAGES = "NetworkManager-libreswan NetworkManager-libreswan-gnome"


URI_NetworkManager-libreswan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/NetworkManager-libreswan-1.2.27-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-libreswan = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libnl-3.so.200()(64bit) ( ) libnl-3.so.200(libnl_3)(64bit) ( ) libnm.so.0()(64bit) ( ) libnm.so.0(libnm_1_0_0)(64bit) ( ) libnm.so.0(libnm_1_2_0)(64bit) ( ) dbus-common ( ) /usr/sbin/ipsec ( ) libnm.so.0(libnm_1_12_0)(64bit) ( ) NetworkManager ( >=  1:1.2.0)"
RPROVIDES:NetworkManager-libreswan = "libnm-vpn-plugin-libreswan.so()(64bit) ( ) NetworkManager-libreswan(x86-64) ( =  1.2.27-2.el10_0) NetworkManager-libreswan ( =  1.2.27-2.el10_0) NetworkManager-openswan ( =  1.2.27-2.el10_0)"

URI_NetworkManager-libreswan-gnome = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/NetworkManager-libreswan-gnome-1.2.27-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:NetworkManager-libreswan-gnome = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) libgraphene-1.0.so.0()(64bit) ( ) libsecret-1.so.0()(64bit) ( ) libnm.so.0()(64bit) ( ) libnm.so.0(libnm_1_0_0)(64bit) ( ) libnm.so.0(libnm_1_2_0)(64bit) ( ) libvulkan.so.1()(64bit) ( ) shared-mime-info ( ) libnma-gtk4.so.0()(64bit) ( ) libnma-gtk4.so.0(libnma_1_2_0)(64bit) ( ) libnma.so.0()(64bit) ( ) libnma.so.0(libnma_1_2_0)(64bit) ( ) NetworkManager-libreswan(x86-64) ( =  1.2.27-2.el10_0)"
RPROVIDES:NetworkManager-libreswan-gnome = "metainfo() ( ) libnm-gtk4-vpn-plugin-libreswan-editor.so()(64bit) ( ) libnm-vpn-plugin-libreswan-editor.so()(64bit) ( ) metainfo(network-manager-libreswan.metainfo.xml) ( ) NetworkManager-libreswan-gnome ( =  1.2.27-2.el10_0) NetworkManager-libreswan-gnome(x86-64) ( =  1.2.27-2.el10_0) NetworkManager-openswan-gnome ( =  1.2.27-2.el10_0)"
