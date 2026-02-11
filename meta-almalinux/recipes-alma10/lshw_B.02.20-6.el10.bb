
PN = "lshw"
PE = "0"
PV = "B.02.20"
PR = "6.el10"
PACKAGES = "lshw lshw-gui"


URI_lshw = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lshw-B.02.20-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lshw = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libsqlite3.so.0()(64bit) ( ) hwdata ( )"
RPROVIDES:lshw = "lshw ( =  B.02.20-6.el10) lshw(x86-64) ( =  B.02.20-6.el10)"

URI_lshw-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lshw-gui-B.02.20-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lshw-gui = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) /usr/bin/bash ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libsqlite3.so.0()(64bit) ( ) polkit ( ) lshw ( =  B.02.20-6.el10)"
RPROVIDES:lshw-gui = "metainfo() ( ) application() ( ) application(gtk-lshw.desktop) ( ) metainfo(gtk-lshw.appdata.xml) ( ) lshw-gui ( =  B.02.20-6.el10) lshw-gui(x86-64) ( =  B.02.20-6.el10)"
