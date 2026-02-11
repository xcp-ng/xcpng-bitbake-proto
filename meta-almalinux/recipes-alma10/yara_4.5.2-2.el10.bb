
PN = "yara"
PE = "0"
PV = "4.5.2"
PR = "2.el10"
PACKAGES = "yara yara-devel yara-doc"


URI_yara = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/yara-4.5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:yara = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libjansson.so.4()(64bit) ( ) libjansson.so.4(libjansson.so.4)(64bit) ( ) libprotobuf-c.so.1()(64bit) ( ) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) ( ) libmagic.so.1()(64bit) ( )"
RPROVIDES:yara = "libyara.so.10()(64bit) ( ) yara ( =  4.5.2-2.el10) yara(x86-64) ( =  4.5.2-2.el10)"

URI_yara-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yara-devel-4.5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:yara-devel = "/usr/bin/pkg-config ( ) pkgconfig(libcrypto) ( ) libyara.so.10()(64bit) ( ) pkgconfig(jansson) ( ) pkgconfig(libprotobuf-c) ( ) yara(x86-64) ( =  4.5.2-2.el10)"
RPROVIDES:yara-devel = "pkgconfig(yara) ( =  4.5.2) yara-devel ( =  4.5.2-2.el10) yara-devel(x86-64) ( =  4.5.2-2.el10)"

URI_yara-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yara-doc-4.5.2-2.el10.noarch.rpm;unpack=0"
RDEPENDS:yara-doc = ""
RPROVIDES:yara-doc = "yara-doc ( =  4.5.2-2.el10)"
