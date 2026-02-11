
PN = "clevis"
PE = "0"
PV = "21"
PR = "8.el10"
PACKAGES = "clevis clevis-dracut clevis-luks clevis-pin-pkcs11 clevis-systemd clevis-udisks2"


URI_clevis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-21-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:clevis = "/bin/sh ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) coreutils ( ) libjansson.so.4()(64bit) ( ) libjansson.so.4(libjansson.so.4)(64bit) ( ) curl ( ) jq ( ) libjose.so.0()(64bit) ( ) libjose.so.0(LIBJOSE_1.0)(64bit) ( ) clevis-pin-tpm2 ( ) jose ( >=  8) tpm2-tools ( >=  4.0.0)"
RPROVIDES:clevis = "group(clevis) ( ) clevis(x86-64) ( =  21-8.el10) clevis ( =  21-8.el10) user(clevis) ( =  dSBjbGV2aXMgLSAiQ2xldmlzIERlY3J5cHRpb24gRnJhbWV3b3JrIHVucHJpdmlsZWdlZCB1c2VyIiAvdmFyL2NhY2hlL2NsZXZpcyAt)"

URI_clevis-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-dracut-21-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:clevis-dracut = "/usr/bin/sh ( ) /usr/bin/bash ( ) dracut-network ( ) clevis-systemd(x86-64) ( =  21-8.el10)"
RPROVIDES:clevis-dracut = "clevis-dracut(x86-64) ( =  21-8.el10) clevis-dracut ( =  21-8.el10)"

URI_clevis-luks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-luks-21-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:clevis-luks = "/usr/bin/bash ( ) cryptsetup ( ) clevis(x86-64) ( =  21-8.el10) luksmeta ( >=  8)"
RPROVIDES:clevis-luks = "clevis-luks(x86-64) ( =  21-8.el10) clevis-luks ( =  21-8.el10)"

URI_clevis-pin-pkcs11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-pin-pkcs11-21-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:clevis-pin-pkcs11 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) /usr/bin/bash ( ) openssl ( ) socat ( ) pcsc-lite ( ) opensc ( ) clevis-luks(x86-64) ( =  21-8.el10) clevis-systemd(x86-64) ( =  21-8.el10) clevis-dracut(x86-64) ( =  21-8.el10)"
RPROVIDES:clevis-pin-pkcs11 = "clevis-pin-pkcs11 ( =  21-8.el10) clevis-pin-pkcs11(x86-64) ( =  21-8.el10)"

URI_clevis-systemd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-systemd-21-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:clevis-systemd = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/bash ( ) clevis-luks(x86-64) ( =  21-8.el10) systemd(x86-64) ( >=  236)"
RPROVIDES:clevis-systemd = "clevis-systemd(x86-64) ( =  21-8.el10) clevis-systemd ( =  21-8.el10)"

URI_clevis-udisks2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-udisks2-21-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:clevis-udisks2 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libjansson.so.4()(64bit) ( ) libjansson.so.4(libjansson.so.4)(64bit) ( ) libaudit.so.1()(64bit) ( ) libudisks2.so.0()(64bit) ( ) libcryptsetup.so.12()(64bit) ( ) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) ( ) libluksmeta.so.0()(64bit) ( ) clevis-luks(x86-64) ( =  21-8.el10)"
RPROVIDES:clevis-udisks2 = "clevis-udisks2 ( =  21-8.el10) clevis-udisks2(x86-64) ( =  21-8.el10)"
