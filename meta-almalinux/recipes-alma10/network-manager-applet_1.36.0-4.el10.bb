
PN = "network-manager-applet"
PE = "0"
PV = "1.36.0"
PR = "4.el10"
PACKAGES = "network-manager-applet nm-connection-editor nm-connection-editor-desktop"


URI_network-manager-applet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/network-manager-applet-1.36.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:network-manager-applet = "libnma(x86-64) ( >=  1.8.27) nm-connection-editor(x86-64) ( =  1.36.0-4.el10) NetworkManager ( >=  1:1.16.0)"
RPROVIDES:network-manager-applet = "network-manager-applet ( =  1.36.0-4.el10) network-manager-applet(x86-64) ( =  1.36.0-4.el10)"

URI_nm-connection-editor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nm-connection-editor-1.36.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nm-connection-editor = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libjansson.so.4()(64bit) ( ) libjansson.so.4(libjansson.so.4)(64bit) ( ) libnm.so.0()(64bit) ( ) libnm.so.0(libnm_1_0_0)(64bit) ( ) libnm.so.0(libnm_1_2_0)(64bit) ( ) libnma.so.0()(64bit) ( ) libnma.so.0(libnma_1_2_0)(64bit) ( ) libnm.so.0(libnm_1_4_0)(64bit) ( ) libnm.so.0(libnm_1_6_0)(64bit) ( ) libnm.so.0(libnm_1_16_0)(64bit) ( ) libnm.so.0(libnm_1_40_0)(64bit) ( ) libnma.so.0(libnma_1_8_0)(64bit) ( ) libnma.so.0(libnma_1_8_28)(64bit) ( ) libnma.so.0(libnma_1_8_36)(64bit) ( ) libnma(x86-64) ( >=  1.8.27)"
RPROVIDES:nm-connection-editor = "nm-connection-editor(x86-64) ( =  1.36.0-4.el10) nm-connection-editor ( =  1.36.0-4.el10)"

URI_nm-connection-editor-desktop = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nm-connection-editor-desktop-1.36.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nm-connection-editor-desktop = "nm-connection-editor(x86-64) ( =  1.36.0-4.el10)"
RPROVIDES:nm-connection-editor-desktop = "metainfo() ( ) application() ( ) application(nm-connection-editor.desktop) ( ) metainfo(nm-connection-editor.appdata.xml) ( ) nm-connection-editor-desktop ( =  1.36.0-4.el10) nm-connection-editor-desktop(x86-64) ( =  1.36.0-4.el10)"
