package Controller;

public interface RegexData {
    String NAME_REGEX = "[А-ЕЖЗЙ-ЩЮЯІЇЄ]{1}[а-еж-щьюяіїє']+[а-еж-щьюяіїє]+$";
    String SURNAME_REGEX = "[А-ЕЖЗЙ-ЩЮЯІЇЄ]{1}[а-еж-щьюяіїє']+[а-еж-щьюяіїє]+$";
    String NICK_NAME_REGEX = "[^_\\\\.&,#@!\\\\?\\\\(\\\\)\\-\\\\=\\\\+\\\\\\\\`\\\\~\\s][A-za-z]{1,5}[A-Za-z0-9_]{0,15}";
}
