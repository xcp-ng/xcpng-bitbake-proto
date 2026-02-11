
PN = "efi-rpm-macros"
PE = "0"
PV = "6"
PR = "6.el10.alma.1"
PACKAGES = "efi-filesystem efi-srpm-macros"


URI_efi-filesystem = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/efi-filesystem-6-6.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:efi-filesystem = "filesystem ( )"
RPROVIDES:efi-filesystem = "efi-filesystem ( =  6-6.el10.alma.1)"

URI_efi-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/efi-srpm-macros-6-6.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:efi-srpm-macros = "/usr/bin/bash ( ) rpm ( )"
RPROVIDES:efi-srpm-macros = "rpm_macro(_efi_srpm_macros_setup) ( ) rpm_macro(efi) ( ) rpm_macro(efi_alt_arch) ( ) rpm_macro(efi_alt_arch_upper) ( ) rpm_macro(efi_arch) ( ) rpm_macro(efi_arch_upper) ( ) rpm_macro(efi_build_requires) ( ) rpm_macro(efi_esp_boot) ( ) rpm_macro(efi_esp_dir) ( ) rpm_macro(efi_esp_efi) ( ) rpm_macro(efi_esp_root) ( ) rpm_macro(efi_has_alt_arch) ( ) rpm_macro(efi_has_arch) ( ) rpm_macro(efi_srpm_macros_version) ( ) rpm_macro(efi_vendor) ( ) efi-srpm-macros ( =  6-6.el10.alma.1)"
