
PN = "open-vm-tools"
PE = "0"
PV = "12.5.0"
PR = "1.el10_0.1"
PACKAGES = "open-vm-tools open-vm-tools-desktop open-vm-tools-salt-minion open-vm-tools-sdmp open-vm-tools-test open-vm-tools-devel"


URI_open-vm-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/open-vm-tools-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) systemd ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libudev.so.1()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) coreutils ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libdrm.so.2()(64bit) ( ) util-linux ( ) grep ( ) libtirpc.so.3()(64bit) ( ) libtirpc.so.3(TIRPC_0.3.0)(64bit) ( ) sed ( ) tar ( ) iproute ( ) libfuse3.so.3()(64bit) ( ) libfuse3.so.3(FUSE_3.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.8)(64bit) ( ) fuse3 ( ) which ( ) libxmlsec1.so.1()(64bit) ( ) pciutils ( ) xmlsec1-openssl ( ) libfuse3.so.3(FUSE_3.1)(64bit) ( ) dbus-tools ( ) libmspack.so.0()(64bit) ( )"
RPROVIDES:open-vm-tools = "libvmtools.so.0()(64bit) ( ) libhgfs.so.0()(64bit) ( ) libvgauth.so.0()(64bit) ( ) libDeployPkg.so.0()(64bit) ( ) libguestStoreClient.so.0()(64bit) ( ) libguestlib.so.0()(64bit) ( ) open-vm-tools(x86-64) ( =  12.5.0-1.el10_0.1) config(open-vm-tools) ( =  12.5.0-1.el10_0.1) open-vm-tools ( =  12.5.0-1.el10_0.1)"

URI_open-vm-tools-desktop = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/open-vm-tools-desktop-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools-desktop = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libX11.so.6()(64bit) ( ) libcairo.so.2()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libudev.so.1()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libXext.so.6()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libXi.so.6()(64bit) ( ) libdrm.so.2()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libXrandr.so.2()(64bit) ( ) libtirpc.so.3()(64bit) ( ) libtirpc.so.3(TIRPC_0.3.0)(64bit) ( ) libfuse3.so.3()(64bit) ( ) libfuse3.so.3(FUSE_3.0)(64bit) ( ) libXinerama.so.1()(64bit) ( ) libXtst.so.6()(64bit) ( ) libvmtools.so.0()(64bit) ( ) libhgfs.so.0()(64bit) ( ) open-vm-tools(x86-64) ( =  12.5.0-1.el10_0.1)"
RPROVIDES:open-vm-tools-desktop = "open-vm-tools-desktop ( =  12.5.0-1.el10_0.1) open-vm-tools-desktop(x86-64) ( =  12.5.0-1.el10_0.1)"

URI_open-vm-tools-salt-minion = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/open-vm-tools-salt-minion-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools-salt-minion = "/usr/bin/bash ( ) systemd ( ) coreutils ( ) grep ( ) gawk ( ) curl ( ) open-vm-tools(x86-64) ( =  12.5.0-1.el10_0.1)"
RPROVIDES:open-vm-tools-salt-minion = "open-vm-tools-salt-minion ( =  12.5.0-1.el10_0.1) open-vm-tools-salt-minion(x86-64) ( =  12.5.0-1.el10_0.1)"

URI_open-vm-tools-sdmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/open-vm-tools-sdmp-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools-sdmp = "/bin/sh ( ) rtld(GNU_HASH) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) coreutils ( ) grep ( ) gawk ( ) iproute ( ) libc.so.6(GLIBC_2.7)(64bit) ( ) glibc-common ( ) libvmtools.so.0()(64bit) ( ) procps ( ) open-vm-tools(x86-64) ( =  12.5.0-1.el10_0.1)"
RPROVIDES:open-vm-tools-sdmp = "open-vm-tools-sdmp ( =  12.5.0-1.el10_0.1) open-vm-tools-sdmp(x86-64) ( =  12.5.0-1.el10_0.1)"

URI_open-vm-tools-test = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/open-vm-tools-test-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools-test = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libvgauth.so.0()(64bit) ( ) open-vm-tools(x86-64) ( =  12.5.0-1.el10_0.1)"
RPROVIDES:open-vm-tools-test = "open-vm-tools-test ( =  12.5.0-1.el10_0.1) open-vm-tools-test(x86-64) ( =  12.5.0-1.el10_0.1)"

URI_open-vm-tools-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/open-vm-tools-devel-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools-devel = "/usr/bin/pkg-config ( ) libDeployPkg.so.0()(64bit) ( ) libguestStoreClient.so.0()(64bit) ( ) libguestlib.so.0()(64bit) ( ) libhgfs.so.0()(64bit) ( ) libvgauth.so.0()(64bit) ( ) libvmtools.so.0()(64bit) ( ) open-vm-tools(x86-64) ( =  12.5.0-1.el10_0.1)"
RPROVIDES:open-vm-tools-devel = "pkgconfig(libDeployPkg) ( =  12.5.0) pkgconfig(vmguestlib) ( =  12.5.0) open-vm-tools-devel ( =  12.5.0-1.el10_0.1) open-vm-tools-devel(x86-64) ( =  12.5.0-1.el10_0.1)"
