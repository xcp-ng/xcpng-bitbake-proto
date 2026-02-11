
PN = "gcr3"
PE = "0"
PV = "3.41.1"
PR = "10.el10"
PACKAGES = "gcr3 gcr3-base gcr3-devel"


URI_gcr3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcr3-3.41.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcr3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) /usr/bin/ssh-add ( ) /usr/bin/ssh-agent ( ) libgck-1.so.0()(64bit) ( ) libgcr-base-3.so.1()(64bit) ( ) gcr3-base(x86-64) ( =  3.41.1-10.el10)"
RPROVIDES:gcr3 = "application() ( ) libgcr-ui-3.so.1()(64bit) ( ) mimehandler(application/pkcs10) ( ) mimehandler(application/pkcs10+pem) ( ) mimehandler(application/pkcs12) ( ) mimehandler(application/pkcs12+pem) ( ) mimehandler(application/pkcs7-mime) ( ) mimehandler(application/pkcs7-mime+pem) ( ) mimehandler(application/pkcs8) ( ) mimehandler(application/pkcs8+pem) ( ) mimehandler(application/pkix-cert) ( ) mimehandler(application/pkix-cert+pem) ( ) mimehandler(application/pkix-crl) ( ) mimehandler(application/pkix-crl+pem) ( ) mimehandler(application/x-pem-file) ( ) mimehandler(application/x-pem-key) ( ) mimehandler(application/x-pkcs12) ( ) mimehandler(application/x-pkcs7-certificates) ( ) mimehandler(application/x-spkac) ( ) mimehandler(application/x-spkac+base64) ( ) mimehandler(application/x-x509-ca-cert) ( ) mimehandler(application/x-x509-user-cert) ( ) application(gcr-prompter.desktop) ( ) application(gcr-viewer.desktop) ( ) gcr3 ( =  3.41.1-10.el10) gcr3(x86-64) ( =  3.41.1-10.el10)"

URI_gcr3-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcr3-base-3.41.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcr3-base = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.28)(64bit) ( ) libgcrypt.so.20()(64bit) ( ) libgcrypt.so.20(GCRYPT_1.6)(64bit) ( ) libp11-kit.so.0()(64bit) ( ) libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) ( )"
RPROVIDES:gcr3-base = "libgck-1.so.0()(64bit) ( ) libgcr-base-3.so.1()(64bit) ( ) gcr3-base(x86-64) ( =  3.41.1-10.el10) gcr3-base ( =  3.41.1-10.el10)"

URI_gcr3-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gcr3-devel-3.41.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcr3-devel = "/usr/bin/pkg-config ( ) pkgconfig(gck-1) ( ) pkgconfig(gcr-base-3) ( ) pkgconfig(gcr-ui-3) ( ) libgck-1.so.0()(64bit) ( ) libgcr-base-3.so.1()(64bit) ( ) libgcr-ui-3.so.1()(64bit) ( ) pkgconfig(glib-2.0) ( >=  2.44) pkgconfig(gio-2.0) ( >=  2.44) pkgconfig(gobject-2.0) ( >=  2.44) pkgconfig(p11-kit-1) ( >=  0.19.0) gcr3(x86-64) ( =  3.41.1-10.el10) pkgconfig(gtk+-3.0) ( >=  3.22)"
RPROVIDES:gcr3-devel = "gcr3-devel ( =  3.41.1-10.el10) gcr3-devel(x86-64) ( =  3.41.1-10.el10) pkgconfig(gck-1) ( =  3.41.1) pkgconfig(gcr-3) ( =  3.41.1) pkgconfig(gcr-base-3) ( =  3.41.1) pkgconfig(gcr-ui-3) ( =  3.41.1)"
