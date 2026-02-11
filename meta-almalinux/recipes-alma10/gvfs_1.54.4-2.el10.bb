
PN = "gvfs"
PE = "0"
PV = "1.54.4"
PR = "2.el10"
PACKAGES = "gvfs gvfs-client gvfs-fuse gvfs-goa gvfs-gphoto2 gvfs-mtp gvfs-smb"


URI_gvfs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libgudev-1.0.so.0()(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libsoup-3.0.so.0()(64bit) ( ) libsecret-1.so.0()(64bit) ( ) polkit ( ) libudisks2.so.0()(64bit) ( ) libgcr-4.so.4()(64bit) ( ) libavahi-glib.so.1()(64bit) ( ) libgvfscommon.so()(64bit) ( ) /usr/bin/wsdd ( ) gvfs-client(x86-64) ( =  1.54.4-2.el10) glib2(x86-64) ( >=  2.70.0) gsettings-desktop-schemas ( >=  3.33.0) udisks2 ( >=  1.97)"
RPROVIDES:gvfs = "libgvfsdaemon.so()(64bit) ( ) gvfs(x86-64) ( =  1.54.4-2.el10) gvfs ( =  1.54.4-2.el10)"

URI_gvfs-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-client-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-client = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( )"
RPROVIDES:gvfs-client = "libgvfscommon.so()(64bit) ( ) libgioremote-volume-monitor.so()(64bit) ( ) libgvfsdbus.so()(64bit) ( ) gvfs-client(x86-64) ( =  1.54.4-2.el10) gvfs-client ( =  1.54.4-2.el10)"

URI_gvfs-fuse = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-fuse-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-fuse = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libfuse3.so.3()(64bit) ( ) libfuse3.so.3(FUSE_3.0)(64bit) ( ) libgvfscommon.so()(64bit) ( ) libfuse3.so.3(FUSE_3.1)(64bit) ( ) libfuse3.so.3(FUSE_3.12)(64bit) ( ) libfuse3.so.3(FUSE_3.2)(64bit) ( ) gvfs-client(x86-64) ( =  1.54.4-2.el10) gvfs(x86-64) ( =  1.54.4-2.el10) fuse3 ( >=  3.0.0)"
RPROVIDES:gvfs-fuse = "gvfs-fuse ( =  1.54.4-2.el10) gvfs-fuse(x86-64) ( =  1.54.4-2.el10)"

URI_gvfs-goa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-goa-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-goa = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgoa-1.0.so.0()(64bit) ( ) gvfs-client(x86-64) ( =  1.54.4-2.el10) gvfs(x86-64) ( =  1.54.4-2.el10)"
RPROVIDES:gvfs-goa = "gvfs-goa ( =  1.54.4-2.el10) gvfs-goa(x86-64) ( =  1.54.4-2.el10)"

URI_gvfs-gphoto2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-gphoto2-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-gphoto2 = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgudev-1.0.so.0()(64bit) ( ) libgvfscommon.so()(64bit) ( ) libgvfsdaemon.so()(64bit) ( ) libgphoto2.so.6()(64bit) ( ) libgphoto2_port.so.12()(64bit) ( ) libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) ( ) gvfs-client(x86-64) ( =  1.54.4-2.el10) gvfs(x86-64) ( =  1.54.4-2.el10)"
RPROVIDES:gvfs-gphoto2 = "gvfs-gphoto2 ( =  1.54.4-2.el10) gvfs-gphoto2(x86-64) ( =  1.54.4-2.el10)"

URI_gvfs-mtp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-mtp-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-mtp = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgudev-1.0.so.0()(64bit) ( ) libusb-1.0.so.0()(64bit) ( ) libgvfscommon.so()(64bit) ( ) libgvfsdaemon.so()(64bit) ( ) libmtp.so.9()(64bit) ( ) gvfs-client(x86-64) ( =  1.54.4-2.el10) gvfs(x86-64) ( =  1.54.4-2.el10)"
RPROVIDES:gvfs-mtp = "gvfs-mtp ( =  1.54.4-2.el10) gvfs-mtp(x86-64) ( =  1.54.4-2.el10)"

URI_gvfs-smb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-smb-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-smb = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgvfscommon.so()(64bit) ( ) libsmbclient.so.0()(64bit) ( ) libsmbclient.so.0(SMBCLIENT_0.1.0)(64bit) ( ) libgvfsdaemon.so()(64bit) ( ) libsmbclient.so.0(SMBCLIENT_0.6.0)(64bit) ( ) gvfs-client(x86-64) ( =  1.54.4-2.el10) gvfs(x86-64) ( =  1.54.4-2.el10)"
RPROVIDES:gvfs-smb = "gvfs-smb ( =  1.54.4-2.el10) gvfs-smb(x86-64) ( =  1.54.4-2.el10)"
